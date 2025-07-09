import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent';
import IncrementN from './IncrementN';

function App() {
  return (
    <div className="App">
      <h2>React with Redux Concept</h2>
      <FirstComponent/>
      <br/>
      <IncrementN></IncrementN>
    </div>
  );
}

export default App;
