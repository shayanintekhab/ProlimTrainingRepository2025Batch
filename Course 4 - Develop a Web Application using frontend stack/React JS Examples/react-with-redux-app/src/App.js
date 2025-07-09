import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent';
import IncrementN from './IncrementN';
import AddStaticNumValue from './AddStaticNumValue';
import DynamicAgeChange from './DynamicAgeChange';

function App() {
  return (
    <div className="App">
      <h2>React with Redux Concept</h2>
      {/* <FirstComponent/>
      <br/>
      <IncrementN></IncrementN>
      <AddStaticNumValue></AddStaticNumValue> */}
      <DynamicAgeChange></DynamicAgeChange>
    </div>
  );
}

export default App;
