import React from 'react';
//import { Link } from 'react-router-dom';

const Sidebar = () => {
    return(
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
            <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Randevu Otomasyonu <sub>Kuafor</sub> </div>
        </a>

        <hr class="sidebar-divider my-0"/>

        <li class="nav-item">
            <a class="nav-link" href="/">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span></a>
        </li>

        <hr class="sidebar-divider  my-0"/>

        <li class="nav-item">
            <a class="nav-link" href="/randevularim">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Randevularım</span></a>
        </li>
        <hr class="sidebar-divider my-0"/>

        <li class="nav-item">
            <a class="nav-link" href="/randevuistekleri">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Randevu İstekleri</span></a>
        </li>

        <hr class="sidebar-divider my-0"/>
        <li class="nav-item">
            <a class="nav-link" href="/ayarlarim">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dükkan Ayarlarım</span></a>
        </li>

        <hr class="sidebar-divider my-0"/>

    </ul>
    );
  };

export default Sidebar;