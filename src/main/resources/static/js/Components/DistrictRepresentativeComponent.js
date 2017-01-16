var DistrictRespesentativeComponent = React.createClass({

  render: function() {
    return (
      <div className="panel panel-default">
        <div className="panel-heading"><h2>Apylinkių atstovai</h2></div>
          <div className="panel-body">
          </div>
            <table className="table table-striped">
            <thead>
            <tr>
              <th>
                Vardas
              </th>
              <th>
                Pavarde
              </th>
              <th>
                Apylinkė
              </th>
            </tr>
            </thead>
            <tbody>
            <DistrictRespesentativeListViewRowComponent name="Jonas" surname="Jonaitis" district="Žirmūnai"/>
            <DistrictRespesentativeListViewRowComponent name="Petras" surname="Petraitis" district="Antakalnis"/>
            <DistrictRespesentativeListViewRowComponent name="As" surname="Antanaitis" district="Senamiestis"/>
            </tbody>

            </table>
        </div>
    );
  }

});

window.DistrictRespesentativeComponent = DistrictRespesentativeComponent;
