import logo from './logo.svg';
import './App.css';
import Header from './components/Header'
import HeaderList from './components/HeaderList'
import { Routes, Route } from 'react-router-dom'
import Main from './pages/Main'
import Join from './pages/Join'
import Login from './pages/Login'

function App() {

  /* Mission!
    - 라우터를 생성해보자!

    STEP 1. 루트 별 컴포넌트 라우터 만들기
    - / : <Main />
    - /join : <Join />
    - /login : <Login />

    STEP 2. 로고를 클릭하면 main 페이지
  */

  return (
    <div>
      <Header />
      <HeaderList />
      {/* 이 이후로 Routes */}
      <Routes>
        <Route path='/' element={<Main />} />
        <Route path='/join' element={<Join />} />
        <Route path='/login' element={<Login />} />
      </Routes>
    </div>
  );
}

export default App;
