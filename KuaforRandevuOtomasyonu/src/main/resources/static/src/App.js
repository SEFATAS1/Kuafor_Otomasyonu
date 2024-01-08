import React from 'react';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/header';
import Footer from './components/footer';
import Sidebar from './components/sidebar'; 
import './vendor/fontawesome-free/css/all.min.css';
import './css/sb-admin-2.min.css';
import './vendor/datatables/dataTables.bootstrap4.min.css';
import Topbar from './components/topbar';
import Home from './pages/home';
import Home2 from './pages/home2';
function App() {
  return (
    <Router>
      <div className="App">
        <Header/>
        <body id="page-top">
          <div id="wrapper">
            <Sidebar/>
            <div id="content-wrapper" class="d-flex flex-column">
              <div id="content">
                <Topbar/>
                <div class="container-fluid">
                  Buraya sayfa içerikleri gelecek
                  <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/home" element={<Home2 />} />
                  </Routes>
                </div>
              </div>
            </div>
          </div>
        </body>
        <Footer/>
      </div>
    </Router>
  );
}

export default App;
