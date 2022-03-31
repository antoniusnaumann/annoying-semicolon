package dev.antonius.annoyingsemicolon.listeners

import dev.antonius.annoyingsemicolon.MyBundle
import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.util.elementType

internal class AnnoyingSemicolonInspector : LocalInspectionTool() {

    private val quickFix = AnnoyingSemicolonQuickFix()
    private val descriptionTemplate = MyBundle.message("problemDescription")

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return AnnoyingSemicolonVisitor(holder);
    }

    internal inner class AnnoyingSemicolonVisitor(val holder: ProblemsHolder) : PsiElementVisitor() {
        override fun visitElement(element: PsiElement) {
            // TODO: Also check if the semicolon is followed by a statement on the same line and provide a different quick fix in this case
            // TODO: Accessing the debug name is a quick fix, please find a proper way to check element types
            if(element.text == ";" && element.parent.elementType?.debugName != "ENUM_ENTRY") {
                holder.registerProblem(element, descriptionTemplate, quickFix)
            }
        }
    }
}

internal class AnnoyingSemicolonQuickFix : LocalQuickFix {
    private val familyName = MyBundle.message("familyName")

    override fun getFamilyName(): String = familyName

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        descriptor.psiElement.delete()
    }

}