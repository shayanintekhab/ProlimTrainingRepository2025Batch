import axios from "axios";
import { useState } from "react";

function Quotes() {
let URL ="https://dummyjson.com/quotes";
let [quotes,setQuotes] = useState([]);

let loadAllQuotes = ()=> {
    //axios.get(URL).then(result=>console.log(result)).catch(error=>console.log(error));    // response = header and body 
   // axios.get(URL).then(result=>console.log(result.data)).catch(error=>console.log(error));
    //axios.get(URL).then(result=>console.log(result.data.quotes)).catch(error=>console.log(error));
    axios.get(URL).then(result=>setQuotes(result.data.quotes)).catch(error=>console.log(error));
}
    return(
        <div>
            <h3>All Quotes Details</h3>
            <input type="button" value="Load All Quotes" onClick={loadAllQuotes} />
            <hr/>
            {
                quotes.map(quote=> 
                    <div key={quote.id}>
                        <h4>{quote.quote}</h4>
                        <p><b>Author:</b> {quote.author}</p>
                        <hr/>
                    </div>
                )
            }
        </div>
    )
}

export default Quotes;