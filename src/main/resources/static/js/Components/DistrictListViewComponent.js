var DistrictListViewComponent = React.createClass({

  render: function() {
    return (
      <div className="panel panel-default">
        <div className="panel-heading"><h2>Apylinkių sąrašas</h2></div>
          <div className="panel-body">
          </div>
            <table className="table table-striped">
            <thead>
            <tr>
              <th>
                Eil. Nr.
              </th>
              <th>
                Pavadinimas
              </th>
              <th>
                Apygarda
              </th>
              <th>
                Atstovas
              </th>
            </tr>
            </thead>
            <tbody>
			  <DistrictListViewRowComponent name="Senamiestis" county="Pilies" representative="M. Šilkienė"/>
            </tbody>
          </table>
        </div>
    );
  }

});

window.DistrictListViewComponent = DistrictListViewComponent;
