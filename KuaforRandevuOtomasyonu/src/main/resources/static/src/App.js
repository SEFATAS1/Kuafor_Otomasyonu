import React from 'react';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/admin/header';
import Footer from './components/admin/footer';
import AdminSidebar from './components/admin/sidebar'; 
import KuaforSidebar from './components/kuafor/sidebar'; 
import './vendor/fontawesome-free/css/all.min.css';
import './css/sb-admin-2.min.css';
import './vendor/datatables/dataTables.bootstrap4.min.css';
import Topbar from './components/admin/topbar';
import AdminHome from './pages/admin/home';
import KuaforHome from './pages/kuafor/home';
import KuaförListesi from './pages/admin/kuaförlistesi';
import Ayarlar from './pages/kuafor/ayarlarim';
import Randevuİstekleri from './pages/kuafor/randevuistekleri';
import Randevularim from './pages/kuafor/randevularim';

function App() {
  const userRole = 'admin';
  return (
    <Router>
      <div className="App">
        <Header/>
        <body id="page-top">
          <div id="wrapper">
            {userRole==='admin' ? <AdminSidebar/> : ''}
            {userRole==='kuafor' ? <KuaforSidebar/> : ''}
            <div id="content-wrapper" class="d-flex flex-column">
              <div id="content">
                <Topbar/>
                <div class="container-fluid">
                  <Routes>
                    <Route path="/" element={userRole==='admin' ? <AdminHome/> :<KuaforHome/>} />
                    <Route path="/kuaforlistesi" element={<KuaförListesi />} />
                    <Route path="/randevularim" element={<Randevularim />} />
                    <Route path="/ayarlarim" element={<Ayarlar />} />
                    <Route path="/randevuistekleri" element={<Randevuİstekleri />} />
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
