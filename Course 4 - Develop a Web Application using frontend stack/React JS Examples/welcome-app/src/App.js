import Employee from "./Employee";
function Header() {
  return <div>This is header Component</div>
}
function Footer() {
  return(
    <div>
    <h2>Footer component</h2>
    <p>Footer component description</p>
    </div>
  )
}
function App() {
  return (
    
    <div>
      <Header></Header>
        <h2>Welcome to React JS Application</h2>
        <Employee></Employee>
      <Footer></Footer>
    </div>

  );
}

export default App;
