import { useEffect, useState } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [hello, setHello] = useState('');
  const [menuList, setMenuList] = useState([]);

  useEffect(() => {
    axios.get('/api/test')
         .then(result => {
            console.log(result);
            console.log(result.data);
            setHello(result.data);
         })
  }, []);

  return (
    <div className="App">
      <h3>서버에서 들어오 값 : {hello}</h3>
      <br/>
      <hr/>
      <br/>

      {
        menuList.map((menu) => {
          return(
            <div>{menu.name}</div>
          )
        })
      }
      <button onClick={()=> {
        axios.get('/api/menuall')
             .then(result => {
                console.log(result);
                setMenuList(result.data);
             })
             .catch(()=>{
                console.log("실패");
             })
      }}>서버에서 메뉴가져오기</button>
      
	  <br/><br/>
	  
      <button onClick={() => {
        axios.post('/api/addmenu',{restaurant:'꾸이한끼', name:'불갈비덮밥', price:12000, type:'KR', taste:'HOT'})
            .then(result => {
              console.log(result);
            })
            .catch(()=>{
              console.log("실패");
           })
      }}>메뉴 데이터 보내기</button>
    </div>
  );
}

export default App;
