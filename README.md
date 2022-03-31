# Annoying Semicolon - An IntelliJ Plugin for semicolon-free Kotlin code

![Build](https://github.com/antoniusnaumann/annoying-semicolon/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/18876-annoying-semicolon.svg)](https://plugins.jetbrains.com/plugin/18876-annoying-semicolon)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/18876-annoying-semicolon.svg)](https://plugins.jetbrains.com/plugin/18876-annoying-semicolon)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Get familiar with the [template documentation][template].
- [x] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [x] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [x] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

## What is this?
<!-- Plugin description -->
Ever worked on a Kotlin project with a friend or colleague who codes in C++ or Java most of their time?

Then you probably know this: Let them code unsupervised and suddenly, you end up with Kotlin code scattered with useless 
semicolons on each and every line end. (Yes, IntelliJ has a warning for this - but your otherwise VIM-only friend will not care)

You wonder how to avoid this? Look no further, this plugin got you covered! It marks every useless semicolon as an error (and provides a quickfix to remove it), so they really get annoying and therefore desirable to avoid.

(This plugin was made as a demo, maybe talking to your friend first might be a more acceptable way to fix this issue)
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "annoying-semicolon"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/antoniusnaumann/annoying-semicolon/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
