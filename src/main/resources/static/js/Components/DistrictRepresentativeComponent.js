var DistrictRepresentativeComponent = React.createClass({

  render: function() {
    return (
      <div className="panel panel-default">
        <div className="panel-heading"><h2>Apylinkės Atstovas</h2></div>
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
                    Atstovas
                  </th>
                </tr>
              </thead>
              <tbody>
                <DistrictRepresentativeListViewRowComponent name="Jonas"/>
                <DistrictRepresentativeListViewRowComponent name="Petras"/>
                <DistrictRepresentativeListViewRowComponent name="As"/>
              </tbody>
            </table>
        </div>
    );
  }

});

window.DistrictRepresentativeComponent = DistrictRepresentativeComponent;
