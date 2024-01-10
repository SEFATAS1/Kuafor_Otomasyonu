import React from 'react';
//import { Link } from 'react-router-dom';

const Sidebar = () => {
    return(
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
            <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Randevu Otomasyonu</div>
        </a>

        <hr class="sidebar-divider my-0"/>

        <li class="nav-item">
            <a class="nav-link" href="/">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span></a>
        </li>

        <hr class="sidebar-divider  my-0"/>

        <li class="nav-item">
            <a class="nav-link" href="/kuaforlistesi">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Kuförler</span></a>
        </li>

        <hr class="sidebar-divider"/>

    </ul>
    );
  };

export default Sidebar;