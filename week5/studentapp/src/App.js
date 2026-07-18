import logo from './logo.svg';
import './App.css';
import About from './About';
import Home from './component/Home';
import Contact from './Contact';
function App() {
  return (
    <div className="container">
      <Home/>
      <About/>
      <Contact/>
    </div>
  );
}

export default App;
