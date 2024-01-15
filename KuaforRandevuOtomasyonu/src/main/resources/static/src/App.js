import React from 'react';
import './App.css';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Header from './components/admin/header';
import Footer from './components/admin/footer';
import Modal from './components/admin/Modal';
import AdminSidebar from './components/admin/sidebar';
import KuaforSidebar from './components/kuafor/sidebar';
import KullaniciSidebar from './components/kullanici/sidebar';
import './vendor/fontawesome-free/css/all.min.css';
import './css/sb-admin-2.min.css';
import './vendor/datatables/dataTables.bootstrap4.min.css';
import Topbar from './components/admin/topbar';
import AdminHome from './pages/admin/home';
import KuaforHome from './pages/kuafor/home'
import KullaniciHome from './pages/kullanici/home';

import KuaförListesi from './pages/admin/kuaförlistesi';
import Ayarlar from './pages/kuafor/ayarlarim';
import Randevuİstekleri from './pages/kuafor/randevuistekleri';
import Randevularim from './pages/kuafor/randevularim';

import Kuaforler from './pages/kullanici/kuaforler';
import RandevularimKullanici from './pages/kullanici/randevularim';

import UnauthrizedPage from './pages/UnauthorizedPage';
import LoginPage from './pages/loginPage';


function App() {
  const userRole = '';
  const elementToRender =
    userRole === 'kuafor' ? (
      <AdminHome />
    ) : userRole === 'kuafor' ? (
      <KuaforHome />
    ) : userRole === 'kullanici' ? (
      <KullaniciHome />
    ) : userRole === '' ? (<Navigate to="/login" replace={true} />) : (<UnauthrizedPage />);

  const body = (
    <div className="App">
      <Header />
      <body id="page-top">
        <div id="wrapper">
          {userRole === 'admin' ? <AdminSidebar /> : ''}
          {userRole === 'kuafor' ? <KuaforSidebar /> : ''}
          {userRole === 'kullanici' ? <KullaniciSidebar /> : ''}
          <div id="content-wrapper" class="d-flex flex-column">
            <div id="content">
              <Topbar />
              <div class="container-fluid">
                <Routes>
                  <Route path="/" element={elementToRender} />
                  <Route path="/kuaforlistesi" element={userRole === 'admin' ? <KuaförListesi /> : <UnauthrizedPage />} />
                  <Route path="/randevularim" element={userRole === 'kuafor' ? <Randevularim /> : <UnauthrizedPage />} />
                  <Route path="/ayarlarim" element={userRole === 'kuafor' ? <Ayarlar /> : <UnauthrizedPage />} />
                  <Route path="/randevuistekleri" element={userRole === 'kuafor' ? <Randevuİstekleri /> : <UnauthrizedPage />} />
                  <Route path="/kuaforler" element={userRole === 'kullanici' ? <Kuaforler /> : <UnauthrizedPage />} />
                  <Route path="/randevularimm" element={userRole === 'kullanici' ? <RandevularimKullanici /> : <UnauthrizedPage />} />
                </Routes>
              </div>
            </div>
          </div>
        </div>
      </body>
      <Footer />
      <Modal />
    </div>
  );
  const loginbody = (
    <div className="App">
      <Header />
      <Routes>
        <Route path="/login" element={<LoginPage />} />
      </Routes>
    </div>
  );
  return (
    <Router>
      {userRole !== '' ? body : loginbody}
    </Router>
  );
}

export default App;
