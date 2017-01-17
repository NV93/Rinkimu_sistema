var CountyCreateEditFormComponent = React.createClass({
  render: function() {
    return (
      <div>
        <form>
          <div className="form-heading">
            <h2> Registruoti/naujinti apylinkės atstovą </h2>
          </div>
          <div className="form-group">
              <label for="cntName">Apygardos pavadinimas:</label>
              <input type="text" className="form-control" id="cntName"/>
          </div>
        </form>
          <div>
              <label>Priklausančios apylinkės:</label>
              <button type="button" className="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Apylinkių sąrašas
              </button>
              <div className="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div className="modal-dialog" role="document">
                  <div className="modal-content">
                    <div className="modal-header">
                      <h5 className="modal-title" id="exampleModalLabel">Apylinkių sąrašas</h5>
                      <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                      </button>
                    </div>
                    <div className="modal-body">
                      ...
                    </div>
                    <div className="modal-footer">
                      <button type="button" className="btn btn-secondary" data-dismiss="modal">Uždaryti</button>
                      <button type="button" className="btn btn-primary">Išsaugoti</button>
                    </div>
                  </div>
                </div>
              </div>
          </div>
          <div className="form-group">
            <a className="btn btn-success btn-sm" href="#" role="button">Registruoti</a>
            <a className="btn btn-warning btn-sm" href="#/county" role="button">Atšaukti</a>
          </div>
      </div>
    );
  }

});

window.CountyCreateEditFormComponent = CountyCreateEditFormComponent;
