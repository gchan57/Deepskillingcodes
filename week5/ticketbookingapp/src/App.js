import React,{useState} from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";
function App() {
  const [isLoggedIn,setIsLoggedIn]=useState(false);
  function login(){
    setIsLoggedIn(true);
  }
  function logout(){
    setIsLoggedIn(false);
  }
  return (
   <div>
    <h1>Ticket Booking App</h1>{
      isLoggedIn?
      <div>
        <button onClick={logout}>
          Logout
        </button>
        <UserPage/>
      </div>
      :
      <div>
         <button onClick={login}>
            Login
            </button>
            <GuestPage />
      </div>
    }
   </div>
  );
}

export default App;
