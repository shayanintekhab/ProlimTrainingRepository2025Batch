import ArrayVariableChange from "./ArrayVariableChange";
import EventWithChangeValue from "./EventWithChangeValue";
import ObjectValueChange from "./ObjectValueChange";
import SimpleEventComponent from "./SimpleEventComponent";

function App() {
  // single line comment 

  /*
    multi line comments 

  */
  return (
    <div>
      <h2>React with Event Concept</h2>
      {/* <SimpleEventComponent></SimpleEventComponent>
      <hr/>
      <EventWithChangeValue></EventWithChangeValue> */}
      {/* <ArrayVariableChange></ArrayVariableChange> */}
      <ObjectValueChange></ObjectValueChange>
    </div>
  );
}

export default App;
