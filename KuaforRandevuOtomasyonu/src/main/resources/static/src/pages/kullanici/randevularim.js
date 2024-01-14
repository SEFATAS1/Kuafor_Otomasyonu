import React, { useState } from 'react';

const KuaförListesi = () => {
  const [selectedCategory, setSelectedCategory] = useState('all');

  const handleCategoryChange = (category) => {
    setSelectedCategory(category);
  };

  const renderAppointments = () => {
    // Randevuları kategorilere göre filtrele
    // Bu sadece örnek bir fonksiyondur, gerçek uygulamaya uygun bir filtreleme işlemi yapılmalıdır.
    const filteredAppointments = [
      // Burada gerçek randevu verileri olmalıdır.
      { category: 'confirmed', stylist: 'Deneme veri', procedure: 'Deneme veridure', date: '2024-01-12', time: '14:30' },
      // ...
    ];

    return filteredAppointments.map((appointment, index) => (
      <div class="container-fluid">
        <div className='row'>
          <div key={index} className="col-lg-6">
            <div className={`card mt-4 mb-4 py-3 border-left-${appointment.category}`}>
              <div className="card-body">
                <h5 className="card-title text-center mb-4">Randevu Detayları</h5>
                <div className="row">
                  <div className="col-md-4">
                    <p className="mb-2 text-center"><strong>Kuaför:</strong> {appointment.stylist}</p>
                    <p className="mb-2 text-center"><strong>İşlem Tipi:</strong> {appointment.procedure}</p>
                  </div>
                  <div className="col-md-4">
                    <p className="mb-2 text-center"><strong>Tarih:</strong> {appointment.date}</p>
                    <p className="mb-2 text-center"><strong>Saat:</strong> {appointment.time}</p>
                  </div>
                  <div className="col-md-4">
                    <p className="mb-2 text-center"><strong>Randevu Durumu</strong></p>
                    <p className="mb-2 text-center" style={{ color: '#f9c740' }}><strong>{appointment.category === 'confirmed' ? 'Onay Bekliyor' : 'Diğer Durum'}</strong></p>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
      <div key={index} className="col-lg-6">
        <div className={`card mt-4 mb-4 py-3 border-left-${appointment.category}`}>
          <div className="card-body">
            <h5 className="card-title text-center mb-4">Randevu Detayları</h5>
            <div className="row">
              <div className="col-md-4">
                <p className="mb-2 text-center"><strong>Kuaför:</strong> {appointment.stylist}</p>
                <p className="mb-2 text-center"><strong>İşlem Tipi:</strong> {appointment.procedure}</p>
              </div>
              <div className="col-md-4">
                <p className="mb-2 text-center"><strong>Tarih:</strong> {appointment.date}</p>
                <p className="mb-2 text-center"><strong>Saat:</strong> {appointment.time}</p>
              </div>
              <div className="col-md-4">
                <p className="mb-2 text-center"><strong>Randevu Durumu</strong></p>
                <p className="mb-2 text-center" style={{ color: '#f9c740' }}><strong>{appointment.category === 'confirmed' ? 'Onay Bekliyor' : 'Diğer Durum'}</strong></p>
              </div>
            </div>
          </div>
        </div>
        
      </div>
        </div>
      </div>

    ));
  };

  return (
    <div className="container-fluid">
      <h1 className="h3 mb-1 text-gray-800">Border Utilities</h1>
      <p className="mb-4">Bootstrap's default utility classes can be found on the official <a href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities below were created to extend this theme past the default utility classes built into Bootstrap's framework.</p>

      <div className="row mb-3">
        <div className='col-md-3'>
          <button
            className={`btn btn-${selectedCategory === 'all' ? 'primary' : 'secondary'} col-md-12`}
            onClick={() => handleCategoryChange('all')}
          >
            Tüm Randevular
          </button>
        </div>
        <div className='col-md-3'>
          <button
            className={`btn btn-${selectedCategory === 'confirmed' ? 'primary' : 'secondary'} col-md-12`}
            onClick={() => handleCategoryChange('confirmed')}
          >
            Onaylanan Randevular
          </button>
        </div>
        <div className='col-md-3'>
          <button
            className={`btn btn-${selectedCategory === 'waiting' ? 'primary' : 'secondary'} col-md-12`}
            onClick={() => handleCategoryChange('waiting')}
          >
            Bekleyen Randevular
          </button>
        </div>
        <div className='col-md-3'>
          <button
            className={`btn btn-${selectedCategory === 'waiting' ? 'primary' : 'secondary'} col-md-12`}
            onClick={() => handleCategoryChange('waiting')}
          >
            Reddedilen Randevular
          </button>
        </div>

      </div>

      <div className="row">
        {renderAppointments()}
      </div>
    </div>
  );
};

export default KuaförListesi;
