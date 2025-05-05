# How to Build Android Applications with Kotlin - Third Edition

<a href="https://www.packtpub.com/en-us/product/how-to-build-android-applications-with-kotlin-9781835882764"><img src="https://content.packt.com/_/image/original/B30938/cover_image.jpg" alt="Book Name" height="256px" align="right"></a>

This is the code repository for [How to Build Android Applications with Kotlin - Third Edition](https://www.packtpub.com/en-us/product/how-to-build-android-applications-with-kotlin-9781835882764), published by Packt.

**A hands-on guide to developing, testing, and publishing production-grade Android 15 apps**

## What is this book about?
This book will equip you to create high-quality, visually appealing Android apps from scratch with Kotlin. You’ll discover a wide range of real-world development challenges faced by developers and explore various techniques to overcome them.

This book covers the following exciting features:
* Create maintainable and scalable apps using Kotlin
* Grasp Android asynchronous programming with coroutines and the Flow API
* Simplify app development with Google architecture components
* Apply MVVM and Repository architecture patterns to standardize retrieving and displaying data from outside sources
* Increase app stability and robustness with unit and integration tests
* Use standard libraries for dependency injection, networking, data parsing, and persistence
* Publish your app on the Google Play Store

If you feel this book is for you, get your [copy](https://www.amazon.com/Build-Android-Applications-Kotlin-hands/dp/B0DGL2ZN4R) today!

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" 
alt="https://www.packtpub.com/" border="5" /></a>


## Instructions and Navigations
All of the code is organized into folders. For example, Chapter02.

The code will look like the following:
```
sealed interface ListItemUiModel {
data class GroupTitle(val name: String) : ListItemUiModel
data class Employee(
    val employee: EmployeeUiModel
) : ListItemUiModel
```

**Following is what you need for this book:**
This book is for beginners as well as intermediate-level developers with no prior experience in Android app development. Basic knowledge of the Kotlin programming language or experience in a similar programming language, along with a willingness to brush up on Kotlin is required.

With the following software and hardware list you can run all code files present in the book (Chapter 1-16).

### Software and Hardware List

| Chapter  | Software required                   | OS required                        |
| -------- | ------------------------------------| -----------------------------------|
| 1-16        | Android Studio Meerkat or later versions                     | Windows, macOS, or Linux |


### Related products
* Kotlin Design Patterns and Best Practices - Second Edition [[Packt]](https://www.packtpub.com/product/kotlin-design-patterns-and-best-practices-second-edition/9781801815727?utm_source=github&utm_medium=repository&utm_campaign=9781801815727) [[Amazon]](https://www.amazon.com/dp/1801815720)

* Simplifying Android Development with Coroutines and Flows [[Packt]](https://www.packtpub.com/product/simplifying-android-development-with-coroutines-and-flows/9781801816243?utm_source=github&utm_medium=repository&utm_campaign=9781801816243) [[Amazon]](https://www.amazon.com/dp/B0B25BXKZT)

## Get to Know the Authors
**Alex Forrester** is an experienced software developer with more than 20 years of experience in mobile and web development and content management systems. He has worked with Android since 2010, creating flagship apps for blue-chip companies across a broad range of industries at Sky, The Automobile Association, HSBC, Discovery Channel, and O2. Alex lives in Hertfordshire with his wife and daughter. When he’s not developing, he likes rugby and running in the Chiltern hills.

**Eran Boudjnah** has been working with Android since around 2013. He's been developing apps and leading mobile teams for a wide range of clients, from start-ups (JustEat, Plume Design) to large scale companies (Sky, HSBC) and conglomerates since 1997. Eran is a developer with well almost three decades of experience in developing mobile applications, websites, desktop applications and interactive attractions. He is passionate about board games (with a modest collection of a few hundred games) and has a 90's Transformers collection on display which he’s quite proud of. Eran lives in Brentwood, Essex in the United Kingdom with Lea, his incredibly supportive wife.

**Alexandru Dumbravan** is an Android developer with more than 10 years of experience building Android apps, focusing on fintech applications since 2016 when he moved to London. In his spare time, Alex enjoys video games, movies, and the occasional gym visit.

**Jomar Tigcal** is an Android developer with over 14 years of experience in mobile and software development. He has worked on various stages of Android app development for small start-ups and large companies since 2012. Jomar has also given talks and conducted training and workshops on Android. In his free time, he likes running and reading. He lives in Vancouver, BC, Canada, with his wife Celine.

## Other books by the authors
* [How to Build Android Apps with Kotlin.](https://www.packtpub.com/product/how-to-build-android-apps-with-kotlin/9781838984113?utm_source=github&utm_medium=repository&utm_campaign=9781838984113)

* [Clean Android Architecture](https://www.packtpub.com/product/clean-android-architecture/9781803234588?utm_source=github&utm_medium=repository&utm_campaign=9781803234588)

* [Simplifying Android Development with Coroutines and Flows](https://www.packtpub.com/product/simplifying-android-development-with-coroutines-and-flows/9781801816243?utm_source=github&utm_medium=repository&utm_campaign=9781801816243)

* [How to Build Android Apps with Kotlin - Second Edition](https://www.packtpub.com/product/how-to-build-android-apps-with-kotlin-second-edition/9781837634934?utm_source=github&utm_medium=repository&utm_campaign=9781803235851)
