# FCMImplementation
GCM deprecated as per google and new FCM (Firebase Cloud Messaging) has been introduced.Here is the complete Implementation of FCM code its steps to create required files i.e google-services.json 
Start by visiting this link https://developers.google.com/identity/sign-in/android/start


<b>Step 1</b>
<img src="https://cloud.githubusercontent.com/assets/3645358/16188718/7074f3ea-36f0-11e6-9734-f5d442f79693.png" width="100%" title="step 1"></img>

Assign package name for your app in our case "com.sample.fcmimplementation" or you can assign anyother package name for your app
Click on "Choose and Configure Services" button.

<b>Step 2</b>
<img src="https://cloud.githubusercontent.com/assets/3645358/16219793/4b8abfa8-37a2-11e6-8884-123062916c4c.png" width="100%" title="step 2"></img>

Tickmark your service "Cloud Messaging" in case of "FCM"(Firebase Cloud Messaging) and then click on <b>Generate configuration files</b>


<b>Step 3</b>
<img src="https://cloud.githubusercontent.com/assets/3645358/16219875/bbff65f4-37a2-11e6-85c3-a56ebae54ff6.png" width="100%" title="step 3"></img>
Here it will generate : 
<ol>
<li>Server API Key</li>
<li>Sender ID</li>
</ol>

Above these two ids will be unique for every package.You can provide these details to server side Team so that they can use these 
id's to send notification to client side.

Here it also has the option for <b>Download google-services.json</b>
download this file and save it in your system.
Later you have to add this file in your project inside app Folder.Your folder structure should be look like this:
<img src="https://cloud.githubusercontent.com/assets/3645358/16189336/5b2127a4-36f3-11e6-8651-ef4fc85759b4.png" width="100%" title="step 4"></img>
Now this is End of required files from google.

<h2>Noted</h2>

if you are going to clone this repo please replace your google-services.json file inside app folder because in this file i have removed my senderKey and app ID.

<b>Happy Coding</b>




