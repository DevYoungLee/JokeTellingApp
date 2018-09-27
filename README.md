 JokeTellingApp is an Android Application that displays jokes from a cloud endpoint using Google Cloud Endpoint <br />
 <br />
 A Custom Java library is used for supplying jokes <br />
 An Android library with an activity is used to display jokes passed to it as intent extras. <br />
 Google Cloud Endpoints is used to supply jokes from the Java library. Project loads jokes from GCE module via an async task. <br />
 Instrumentated tests are written to verify that the async task is indeed loading jokes. <br />
 Paid/free flavors are included The paid flavor has no AdMob ads, and no unnecessary dependencies. <br />
 <br />
 The application has two variants. <br />
 The free variant shows banner AdMob Ads: <br />
 ![Alt text](screenshots/main_screen_free "Free Main Screen") <br />
 The paid variant shows no ads: <br />
 ![Alt text](screenshots/main_screen_paid "Paid Main Screen") <br />
 Clicking on the tell joke button shows a funny joke using an activity supplied by a custom android library: <br />
 ![Alt text](screenshots/joke_screen "Funny Joke") <br />
 <br />
 Thank you for reading! <br />
 Any suggestions will be greatly appreciated! <br />
