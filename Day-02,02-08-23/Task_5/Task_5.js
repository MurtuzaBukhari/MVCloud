  // Import the functions you need from the SDKs you need
  // import { initializeApp } from "https://www.gstatic.com/firebasejs/10.1.0/firebase-app.js";
  //   import { getDatabase, ref, set, get, child } from "https://www.gstatic.com/firebasejs/10.1.0/firebase-app.js"; 
    const firebaseConfig = {
    apiKey: "AIzaSyCDg6LxBbh2UxgG0LEg64D852rx-ZfQFCk",
    authDomain: "mvclouds-1e697.firebaseapp.com",
    projectId: "mvclouds-1e697",
    storageBucket: "mvclouds-1e697.appspot.com",
    messagingSenderId: "46064883945",
    appId: "1:46064883945:web:9ddcaf03d14fa1dd42b878",
    measurementId: "G-XQ58C4X26R"
  };

  // Initialize Firebase
  const app = initializeApp(firebaseConfig);

  // const db = getDatabase(app);
//   document.getElementById("B1").addEventListener('click',function(e){
// set(ref(db,' FirstName/'+document.getElementById("fname").value),
// {
// FirstName : document.getElementById("fname").value,
// LastName : document.getElementById("lname").value,
// Email : document.getElementById("mail").value,
// Password : document.getElementById("pass").value,
// ConfirmPassword : document.getElementById("passagain").value,
// Age : document.getElementById("age").value,
// Bio : document.getElementById("TA").value

// })
// alert("login Successfull")
//   })
console.log(firebase)
function save(){
   var FirstName = document.getElementById("fname").value;
    firebase.database().ref("/").child(FirstName).update({
        FirstName : document.getElementById("fname").value,
        LastName : document.getElementById("lname").value,  
        Email : document.getElementById("mail").value,
        Password : document.getElementById("pass").value,
        ConfirmPassword : document.getElementById("passagain").value,
        Age : document.getElementById("age").value,
        Bio : document.getElementById("TA").value
    });
}