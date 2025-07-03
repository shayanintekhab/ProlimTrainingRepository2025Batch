
import ArrayStateVariable from './ArrayStateVariable';
import PrimitiveStateVariableComponent from './PrimitiveStateVariableComponent';
import Product from './Product';

function App() {
  return (
    <div>
      <h2>React State variable Examples</h2>
      <PrimitiveStateVariableComponent></PrimitiveStateVariableComponent>
      <ArrayStateVariable></ArrayStateVariable>
      <hr/>
      <Product></Product>
    </div>
  );
}

export default App;
