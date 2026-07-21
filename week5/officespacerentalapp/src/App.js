import lffice from "./office.jpg";

function App() {

  const office = {
    Name: "DBS Business Center",
    Rent: 55000,
    Address: "Chennai"
  };

  const officeList = [

    {
      Name: "DBS Business Center",
      Rent: 55000,
      Address: "Chennai"
    },

    {
      Name: "Tidel Park",
      Rent: 75000,
      Address: "Chennai"
    },

    {
      Name: "RMZ Millenia",
      Rent: 90000,
      Address: "Bangalore"
    }

  ];

  return (

    <div>

      <h1>Office Space Rental App</h1>

      <img
        src={lffice}
        alt="Office"
        width="400"
      />

      <h2>Featured Office</h2>

      <p><b>Name :</b> {office.Name}</p>

      <p>
        <b>Rent :</b>

        <span
          style={{
            color:
              office.Rent < 60000
                ? "red"
                : "green"
          }}
        >
          {office.Rent}
        </span>

      </p>

      <p><b>Address :</b> {office.Address}</p>

      <hr />

      <h2>Office List</h2>

      {

        officeList.map((item, index) => (

          <div key={index}>

            <h3>{item.Name}</h3>

            <p>

              Rent :

              <span
                style={{
                  color:
                    item.Rent < 60000
                      ? "red"
                      : "green"
                }}
              >

                {item.Rent}

              </span>

            </p>

            <p>Address : {item.Address}</p>

            <hr />

          </div>

        ))

      }

    </div>

  );

}

export default App;