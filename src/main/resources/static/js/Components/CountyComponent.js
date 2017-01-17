
var CountyComponent = React.createClass({

  render: function() {
    return (
      <div className="panel panel-default">
        <div className="panel-heading">
          <h3>Rinkimų apygardų sąrašas</h3>
        </div>
          <div className="panel-body">
            <a href="#/county/createRep"><button type="button" className="btn btn-success btn-sm">Registruoti</button></a>
            <span>
              <h5>Registruoti naują apygardą </h5>
            </span>
          </div>
            <table className="table table-striped">
              <thead>
                <tr>
                  <th>
                    Nr
                  </th>
                  <th>
                    Apygarda
                  </th>
                  <th>
                    Redaguoti
                  </th>
                </tr>
              </thead>
              <tbody>
                <CountyListRowComponent name="Vilnius" nr="1"/>
                <CountyListRowComponent name="Kaunas" nr="2"/>
                <CountyListRowComponent name="Centras" nr="3"/>
              </tbody>
            </table>
        </div>
    );
  }

});

window.CountyComponent = CountyComponent;
