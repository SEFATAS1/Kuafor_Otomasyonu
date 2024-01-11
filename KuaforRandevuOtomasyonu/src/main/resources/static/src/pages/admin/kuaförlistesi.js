import React from 'react';

const KuaförListesi = () => {
    return(
      <div class="container-fluid">

      <h1 class="h3 mb-2 text-gray-800">Kuaför Tablosu</h1>
      <div class="card shadow mb-4">
        <div class="card-header py-3">
          <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
        </div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Ad-Soyad</th>
                  <th>Mail Adresi</th>
                  <th>Sil</th>
                  <th>Güncelle</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>                
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
                <tr>
                  <td>Tiger Nixon</td>
                  <td>System Architect</td>
                  
                  <td class="text-center"><button class="btn btn-outline-danger" style={{ width: '100%', height: '100%' }}>Sil</button></td>

                  <td class="text-center"><button class="btn btn-outline-warning" style={{ width: '100%', height: '100%' }}>Güncelle</button></td>
                </tr>   
              </tbody>
            </table>
            <div class="text-center">
              <button class="btn btn-outline-primary" style={{ width: '500px' }}>Yeni Kuaför Ekle</button>
            </div>         
          </div>
        </div>
      </div>
    </div>
      );
  };

export default KuaförListesi;