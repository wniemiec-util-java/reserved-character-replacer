![](https://github.com/wniemiec-util-java/reserved-character-replacer/blob/master/docs/img/logo/logo.jpg)

<h1 align='center'>Reserved Character Replacer</h1>
<p align='center'>Responsible for replacing all characters reserved by the operating system with others according to a mapping.</p>
<p align="center">
	<a href="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/windows.yml"><img src="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/windows.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/macos.yml"><img src="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/macos.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/ubuntu.yml"><img src="https://github.com/wniemiec-util-java/reserved-character-replacer/actions/workflows/ubuntu.yml/badge.svg" alt=""></a>
	<a href="https://codecov.io/gh/wniemiec-util-java/reserved-character-replacer"><img src="https://codecov.io/gh/wniemiec-util-java/reserved-character-replacer/branch/master/graph/badge.svg?token=R2SFS4SP86" alt="Coverage status"></a>
	<a href="http://java.oracle.com"><img src="https://img.shields.io/badge/java-11+-D0008F.svg" alt="Java compatibility"></a>
	<a href="https://mvnrepository.com/artifact/io.github.wniemiec-util-java/reserved-character-replacer"><img src="https://img.shields.io/maven-central/v/io.github.wniemiec-util-java/reserved-character-replacer" alt="Maven Central release"></a>
	<a href="https://github.com/wniemiec-util-java/reserved-character-replacer/blob/master/LICENSE"><img src="https://img.shields.io/github/license/wniemiec-util-java/reserved-character-replacer" alt="License"></a>
</p>
<hr />

## ❇ Introduction
If you need to know if a piece of code has already been executed by another process, then this is the perfect library for you. A reserved-character-replacer is a class and method marker, and it is used when you want a piece of code, even if executed by several independent processes, to be executed only once.

## ❓ How to use
1. Add one of the options below to the pom.xml file: 

#### Using Maven Central (recomended):
```
<dependency>
  <groupId>io.github.wniemiec-util-java</groupId>
  <artifactId>reserved-character-replacer</artifactId>
  <version>LATEST</version>
</dependency>
```

#### Using GitHub Packages:
```
<dependency>
  <groupId>wniemiec.util.java</groupId>
  <artifactId>reserved-character-replacer</artifactId>
  <version>LATEST</version>
</dependency>
```

2. Run
```
$ mvn install
```

3. Use it
```
[...]

import wniemiec.util.java.ReservedCharactersReplacerFactory;
import wniemiec.util.java.Replacer;

[...]

Replacer replacer = ReservedCharactersReplacerFactory.getStandardReplacer();
String reservedCharacters = "<>/\\:\"|?*";

System.out.println( replacer.replace(reservedCharacters) );

[...]
```

## 📖 Documentation
|        Property        |Parameter type|Return type|Description|Default parameter value|
|----------------|-------------------------------|-----|------------------------|--------|
|replace |`str: String`|`String`|Replaces all reserved characters with others.| - |

## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/wniemiec-util-java/reserved-character-replacer/releases).

## 🤝 Contribute!
See the documentation on how you can contribute to the project [here](https://github.com/wniemiec-util-java/reserved-character-replacer/blob/master/CONTRIBUTING.md).

## 📁 Files

### /
|        Name        |Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|src     |`Directory`| Source files|
