import React from 'react';

const KuaforHome = () => {
    return(
      <div class="container-fluid">

          <h1 class="h3 mb-1 text-gray-800">Randevu İstekleri</h1>
          <p class="mb-4">Bootstrap's default utility classes can be found on the official <a href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities below were created to extend this theme past the default utility classes built into Bootstrap's framework.</p>

          <div class="row">
            
            <div class="col-lg-6">

            <div class="card mb-4 py-3 border-left-primary">
              <div class="card-body">
                <div class="d-flex justify-content-between align-items-center">
                <strong>Randevu Detayları:</strong>
                <div class="d-flex justify-content-end">
                  <div class="text-left mb-2">
                    <p class="mb-0">
                      <span class="ml-2"><strong>Ad / Soyad:</strong> John Doe</span>
                      <span class="ml-2"><strong>İşlem:</strong> Saç Kesimi</span>
                    </p>
                    <p class="mb-0">
                      <span class="ml-2"><strong>Date:</strong> 2022-01-01</span>
                      <span class="ml-2"><strong>Saat:</strong> 12:00</span>
                    </p>
                  </div>
                </div>
                  <div class="d-flex flex-row">
                    <button class="btn btn-success mx-2">Onayla</button>
                    <button class="btn btn-danger">Reddet</button>
                  </div>
                </div>
              </div>
            </div>

              <div class="card mb-4 py-3 border-left-success">
                <div class="card-body">
                  .border-left-success
                </div>
              </div>

              <div class="card mb-4 py-3 border-left-info">
                <div class="card-body">
                  .border-left-info
                </div>
              </div>

              <div class="card mb-4 py-3 border-left-warning">
                <div class="card-body">
                  .border-left-warning
                </div>
              </div>

              <div class="card mb-4 py-3 border-left-danger">
                <div class="card-body">
                  .border-left-danger
                </div>
              </div>

            </div>

            <div class="col-lg-6">

              <div class="card mb-4 py-3 border-bottom-primary">
                <div class="card-body">
                burada küçük bir tasarım yapılması gerekiyor her kutucuğun içinde randevunun gelen randevunun bilgileri olmalı ve kutucuğun sonunda bir kabul ve ret butonu olabilir.
                </div>
              </div>

              <div class="card mb-4 py-3 border-bottom-success">
                <div class="card-body">
                  .border-bottom-success
                </div>
              </div>

              <div class="card mb-4 py-3 border-bottom-info">
                <div class="card-body">
                  .border-bottom-info
                </div>
              </div>

              <div class="card mb-4 py-3 border-bottom-warning">
                <div class="card-body">
                  .border-bottom-warning
                </div>
              </div>

              <div class="card mb-4 py-3 border-bottom-danger">
                <div class="card-body">
                  .border-bottom-danger
                </div>
              </div>

            </div>

          </div>

        </div>
      );
  };

export default KuaforHome;