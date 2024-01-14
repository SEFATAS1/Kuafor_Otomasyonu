import React from 'react';

const KuaforHome = () => {
  return (
    <div class="container-fluid">

      <h1 class="h3 mb-1 text-gray-800">Border Utilities</h1>
      <p class="mb-4">Bootstrap's default utility classes can be found on the official <a href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities below were created to extend this theme past the default utility classes built into Bootstrap's framework.</p>

      <div class="row">
        <div class="col-lg-6">
          <div class="card mb-4 py-3 border-left-primary">
            <div class="card-body">
              <h5 class="card-title text-center">Randevu Detayları</h5>
              <div class="row text-center">
                <div class="col-sm-6">
                  <p><strong>Randevu Sahibi:</strong> John Doe</p>
                </div>
                <div class="col-sm-6">
                  <p><strong>İşlem Tipi:</strong> Örnek İşlem</p>
                </div>
              </div>
              <div class="row text-center">
                <div class="col-sm-6">
                  <p><strong>Tarih:</strong> 2024-01-12</p>
                </div>
                <div class="col-sm-6">
                  <p><strong>Saat:</strong> 14:30</p>
                </div>
              </div>
              <div class="text-center">
                <button type="button" class="btn btn-success mr-4">Randevuyu Gerçekleşti</button>
                &nbsp; 
                <button type="button" class="btn btn-danger">Randevu Gerçekleşmedi</button>
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
              burada küçük bir tasarım yapılması gerekiyor her kutucuğun içinde randevunun detaylarının gelmesi için ayrıca tıklandığında bir modal ile ayrıntılar gelsin ve açılan modalda randevu olumlu yada olumsuz olarak kayıt edilip kapatabilinmelidir.
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