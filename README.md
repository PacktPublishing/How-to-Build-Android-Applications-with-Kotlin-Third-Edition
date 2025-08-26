<h1 align="center">
How to Build Android Applications with Kotlin, Third Edition</h1>
<p align="center">This is the code repository for <a href ="https://www.packtpub.com/en-us/product/how-to-build-android-applications-with-kotlin-third-edition/9781835882764"> How to Build Android Applications with Kotlin, Third Edition</a>, published by Packt.
</p>

<h2 align="center">
A hands-on guide to developing, testing, and publishing production-grade Android 16 apps
</h2>
<p align="center">
Alex Forrester, Eran Boudjnah, Alexandru Dumbravan, Jomar Tigcal</p>

<p align="center">
  <a href="https://packt.link/free-ebook/9781835882764"><img width="32px" alt="Free PDF" title="Free PDF" src="https://cdn-icons-png.flaticon.com/512/4726/4726010.png"/></a>
 &#8287;&#8287;&#8287;&#8287;&#8287;
  <a href="https://packt.link/gbp/9781835882764"><img width="32px" alt="Graphic Bundle" title="Graphic Bundle" src="https://cdn-icons-png.flaticon.com/512/2659/2659360.png"/></a>
  &#8287;&#8287;&#8287;&#8287;&#8287;
   <a href="https://www.amazon.com/Build-Android-Applications-Kotlin-hands/dp/B0DGL2ZN4R/"><img width="32px" alt="Amazon" title="Get your copy" src="https://cdn-icons-png.flaticon.com/512/15466/15466027.png"/></a>
  &#8287;&#8287;&#8287;&#8287;&#8287;
</p>
<details open> 
  <summary><h2>About the book</summary>
<a href="https://www.packtpub.com/product/unity-cookbook-fifth-edition/9781805123026">
<img src="https://content.packt.com/B30938/cover_image_small.jpg" alt="Unity Cookbook, Fifth Edition" height="256px" align="right">
</a>

Written by four veteran developers with 60+ years of collective experience, this updated third edition will jumpstart your Android development journey, focusing on Kotlin libraries and Jetpack Compose, Google’s powerful declarative UI framework.
You’ll learn the fundamentals of app development, enabling you to use Android Studio, as well as get to grips with Jetpack Compose to create your first screens, build apps to run them on virtual devices through guided exercises, and implement Jetpack Compose’s layout groups to make the most of lists, images, and maps. The book has been updated with Kotlin’s powerful networking and coroutines libraries to help you fetch data in the background from a web service and manage displaying the data using Kotlin flows. You’ll learn about testing, creating clean architecture, and persisting data, as well as exploring the dependency injection pattern and learning how to publish your apps on the Google Play Store. You'll also work on realistic projects split up into bite-size exercises and activities, along with building apps to create quizzes, read news articles, check weather reports, store recipes, retrieve movie information, and remind you where you parked your car.
By the end of this book, you'll have gained the skills and confidence to build your own creative Android apps using Kotlin.</details>
<details open> 
  <summary><h2>Key Learnings</summary>
<ul>

<li>Create maintainable and scalable apps using Kotlin</li>

<li>Grasp Android asynchronous programming with coroutines and the Flow API</li>

<li>Simplify app development with Google architecture components</li>

<li>Apply MVVM and Repository architecture patterns to standardize retrieving and displaying data from outside sources</li>

<li>Increase app stability and robustness with unit and integration tests</li>

<li>Use standard libraries for dependency injection, networking, data parsing, and persistence</li>

<li>Publish your app on the Google Play Store</li>

</ul>

  </details>

<details open> 
  <summary><h2>Chapters</summary>
     <img src="https://cliply.co/wp-content/uploads/2020/02/372002150_DOCUMENTS_400px.gif" alt="Unity Cookbook, Fifth Edition" height="556px" align="right">
<ol>

  <li>Creating Your First App</li>

  <li>Building User Screen Flows</li>

  <li>Developing the UI with Jetpack Compose</li>

  <li>Building App Navigation</li>

  <li>Essential Libraries – Ktor, Kotlin Serialization, and Coil</li>

  <li>Building Lists with Jetpack Compose</li>

  <li>Android Permissions and Google Maps</li>

  <li>Services, WorkManager, and Notifications</li>

  <li>Testing with JUnit, Mockito, MockK, and Compose</li>

  <li>Coroutines and Flow</li>

  <li>Android Architecture Components</li>

  <li>Persisting Data</li>

  <li>Dependency Injection with Dagger, Hilt, and Koin</li>

  <li>Architecture Patterns</li>

  <li>Advanced Jetpack Compose</li>

  <li>Launching Your App on Google Play</li>

</ol>

</details>

If you feel this book is for you, get your <a href=https://www.amazon.com/Build-Android-Applications-Kotlin-hands/dp/B0DGL2ZN4R>copy</a> today!

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

| Chapter  | Software required                        | OS required                        |
| -------- | -----------------------------------------| -----------------------------------|
| 1-16     | Android Studio Meerkat or later versions | Windows, macOS, or Linux           |


## Get to Know the Authors
**Alex Forrester** is an experienced software developer with more than 20 years of experience in mobile and web development and content management systems. He has worked with Android since 2010, creating flagship apps for blue-chip companies across a broad range of industries at Sky, The Automobile Association, HSBC, Discovery Channel, NatWest, and O2. Alex lives in Hertfordshire with his wife and daughter. When he’s not developing, he likes playing touch rugby and running in the Chiltern Hills.

**Eran Boudjnah** has been developing apps and leading mobile teams for a wide range of clients, from start-ups (Just Eat and Plume Design) to large-scale companies (Sky and HSBC) and conglomerates, since 1997. He has been working with Android since around 2013. Eran is a developer with almost three decades of experience in developing mobile applications, websites, desktop applications, and interactive attractions. He is passionate about board games and has a 1990s Transformers collection that he’s quite proud of. Eran lives in Brentwood, Essex, in the United Kingdom, with Lea, his incredibly supportive wife.

**Alexandru Dumbravan** is an Android developer with more than 10 years of experience in building Android apps, focusing on fintech applications since 2016 when he moved to London. In his spare time, Alex enjoys playing video games, watching movies, and occasionally visiting the gym.

**Jomar Tigcal** is an Android developer with over 15 years of experience in mobile and software development. He has worked on various stages of Android app development for small start-ups and large companies since 2012. Jomar has also given talks and conducted training and workshops on Android. In his free time, he likes running and reading. He lives in Vancouver, BC, Canada, with his wife, Celine.

## Other books by the authors
* [How to Build Android Apps with Kotlin.](https://www.packtpub.com/product/how-to-build-android-apps-with-kotlin/9781838984113?utm_source=github&utm_medium=repository&utm_campaign=9781838984113)

* [Clean Android Architecture](https://www.packtpub.com/product/clean-android-architecture/9781803234588?utm_source=github&utm_medium=repository&utm_campaign=9781803234588)

* [Simplifying Android Development with Coroutines and Flows](https://www.packtpub.com/product/simplifying-android-development-with-coroutines-and-flows/9781801816243?utm_source=github&utm_medium=repository&utm_campaign=9781801816243)

* [How to Build Android Apps with Kotlin - Second Edition](https://www.packtpub.com/product/how-to-build-android-apps-with-kotlin-second-edition/9781837634934?utm_source=github&utm_medium=repository&utm_campaign=9781803235851)

## Other Related Books
<ul>

  <li><a href="https://www.packtpub.com/en-us/product/android-ui-development-with-jetpack-compose-second-edition/9781837634255">Android UI Development with Jetpack Compose, Second Edition</a></li>

  <li><a href="https://www.packtpub.com/en-us/product/net-maui-cookbook-first-edition/9781835461129">.NET MAUI Cookbook, First Edition</a></li>

  <li><a href="https://www.packtpub.com/en-us/product/thriving-in-android-development-using-kotlin--first-edition/9781837631292">Thriving in Android Development Using Kotlin , First Edition</a></li>
 
</ul>
