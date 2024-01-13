import React, { useState } from 'react';

const KuaforHome = () => {
  const [calismaSaatleri, setCalismaSaatleri] = useState('');
  const [randevuSaatAraligi, setRandevuSaatAraligi] = useState('15');
  const [randevuBaslangic, setRandevuBaslangic] = useState('');
  const [randevuBitis, setRandevuBitis] = useState('');
  const [seciliGunler, setSeciliGunler] = useState(['pazartesi','salı','çarşamba','perşembe','cuma','cumartesi','pazar']);
  const [randevuSaatDakikaListesi, setRandevuSaatDakikaListesi] = useState({
    pazartesi: [],
    sali: [],
    carsamba: [],
    persembe: [],
    cuma: [],
    cumartesi: [],
    pazar: [],
  });
  const gunler = ["pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"];

  const handleFormSubmit = (e) => {
    e.preventDefault();
    // Çalışma saatlerini ve seçilen aralığı kullanarak randevu saatlerini hesapla
    const baslangicSaat = new Date(`2022-01-01 ${randevuBaslangic}`);
    const bitisSaat = new Date(`2022-01-01 ${randevuBitis}`);
    const aralik = parseInt(randevuSaatAraligi, 10);
    const randevular = [];

    while (baslangicSaat < bitisSaat) {
      randevular.push({
        saat: baslangicSaat.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' }),
        secili: true,
      });
      baslangicSaat.setMinutes(baslangicSaat.getMinutes() + aralik);
    }

    // Hesaplanan randevu saatlerini state'e setle
    setRandevuSaatDakikaListesi(randevular);
  };
  return (
    <div className="container mt-5">
      <h2 className="text-center mb-4">Çalışma ve Randevu Saatleri Ayarları</h2>

      <form onSubmit={handleFormSubmit}>
        {/* Çalışma Saatleri */}
        <div className="form-group">
          <label htmlFor="calismaSaatleri">Çalışma Saatleri:</label>
          <input
            type="text"
            className="form-control"
            id="calismaSaatleri"
            placeholder="Örneğin: 09:00 - 18:00"
            value={calismaSaatleri}
            onChange={(e) => setCalismaSaatleri(e.target.value)}
          />
        </div>
        {/* Gün Seçimi */}
        <div className="form-group">
          <label>Gün Seçimi:</label>
          {gunler.map((gun) => (
            <div key={gun} className="form-check form-check-inline">
              <input
                className="form-check-input"
                type="checkbox"
                id={gun}
                checked={seciliGunler.includes(gun)}
                onChange={() => {
                  const yeniSeciliGunler = seciliGunler.includes(gun)
                    ? seciliGunler.filter((seciliGun) => seciliGun !== gun)
                    : [...seciliGunler, gun];
                  setSeciliGunler(yeniSeciliGunler);
                }}
              />
              <label className="form-check-label" htmlFor={gun}>{gun.charAt(0).toUpperCase() + gun.slice(1)}</label>
            </div>
          ))}
        </div>

        {/* Randevu Saat Aralığı */}
        <div className="form-group">
          <label htmlFor="randevuSaatAraligi">Randevu Saat Aralığı:</label>
          <select
            className="form-control"
            id="randevuSaatAraligi"
            value={randevuSaatAraligi}
            onChange={(e) => setRandevuSaatAraligi(e.target.value)}
          >
            <option value="15">15 Dakika</option>
            <option value="30">30 Dakika</option>
            <option value="45">45 Dakika</option>
            <option value="60">1 Saat</option>
          </select>
        </div>
        <div>

        </div>
        {/* Randevu Başlangıç ve Bitiş Saatleri */}
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="randevuBaslangic">Randevu Başlangıç Saati:</label>
            <input
              type="time"
              className="form-control"
              id="randevuBaslangic"
              value={randevuBaslangic}
              onChange={(e) => setRandevuBaslangic(e.target.value)}
            />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="randevuBitis">Randevu Bitiş Saati:</label>
            <input
              type="time"
              className="form-control"
              id="randevuBitis"
              value={randevuBitis}
              onChange={(e) => setRandevuBitis(e.target.value)}
            />
          </div>
        </div>

        {/* Kaydet Butonu */}
        <button type="submit" className="btn btn-primary">Ayarları Kaydet</button>
      </form>
      {/* Hesaplanan Randevu Saatleri Tablosu */}
      {randevuSaatDakikaListesi.length > 0 && (
        <div className="mt-4">
          <h4>Hesaplanan Randevu Saatleri</h4>
          <div className="row">
            <div className="col-md-6">
              <table className="table">
                <thead>
                  <tr>
                    <th>Seç</th>
                    <th>#</th>
                    <th>Saat</th>
                  </tr>
                </thead>
                <tbody>
                  {randevuSaatDakikaListesi.slice(0, randevuSaatDakikaListesi.length / 2).map((randevu, index) => (
                    <tr key={index}>
                      <td>
                        <input
                          type="checkbox"
                          checked={randevu.secili}
                          onChange={() => {
                            const yeniRandevular = [...randevuSaatDakikaListesi];
                            yeniRandevular[index].secili = !yeniRandevular[index].secili;
                            setRandevuSaatDakikaListesi(yeniRandevular);
                          }}
                        />
                      </td>
                      <td>{index + 1}</td>
                      <td>{randevu.saat}</td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
            <div className="col-md-6">
              <table className="table">
                <thead>
                  <tr>
                    <th>Seç</th>
                    <th>#</th>
                    <th>Saat</th>
                  </tr>
                </thead>
                <tbody>
                  {randevuSaatDakikaListesi.slice(randevuSaatDakikaListesi.length / 2).map((randevu, index) => (
                    <tr key={index}>
                      <td>
                        <input
                          type="checkbox"
                          checked={randevu.secili}
                          onChange={() => {
                            const yeniRandevular = [...randevuSaatDakikaListesi];
                            const yeniIndex = index + randevuSaatDakikaListesi.length / 2;
                            yeniRandevular[yeniIndex].secili = !yeniRandevular[yeniIndex].secili;
                            setRandevuSaatDakikaListesi(yeniRandevular);
                          }}
                        />
                      </td>
                      <td>{index + 1 + randevuSaatDakikaListesi.length / 2}</td>
                      <td>{randevu.saat}</td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};

export default KuaforHome;