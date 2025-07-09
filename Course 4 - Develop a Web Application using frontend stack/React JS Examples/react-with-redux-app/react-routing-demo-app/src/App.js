import logo from './logo.svg';
import './App.css';
import { Link, Route, Routes } from 'react-router-dom';
import AboutUs from './AboutUs';
import ContactUs from './ContactUs';

function App() {
  return (
    <div className="App">
      <h2>React routing example </h2>
      <div>
        <Link to="/about_us" className='myLinkClass'>AboutUs</Link>
        <Link to="/contact_us" className='myLinkClass'>ContactUs</Link>
        <Link to="/feedback" className='myLinkClass'>Feedback</Link>
        <Link to="/login" className='myLinkClass'>Login</Link>
      </div>
      <hr/>
      <Routes>
          <Route path='/about_us' element={<AboutUs/>}></Route>
          <Route path='/contact_us' element={<ContactUs/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
