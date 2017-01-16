var DistrictCreateEditComponent = React.createClass({

  render: function() {
    return (
        <div className="panel panel-default">
          <div className="panel-body">
            <form onSubmit={this.props.onHandleSubmit}>
              <div className="form-group">
                <label>Pavadinimas</label>
                <input onChange={this.props.onHandleUsernameChange} className="form-control"/>
              </div>
              <div className="form-group">
                <label>Apygardos</label>
                <div class="dropdown">
                  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                  Pasirinkite
                    <span class="caret"></span>
                  </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                      <li><a href="#">Action</a></li>
                      <li><a href="#">Another action</a></li>
                      <li><a href="#">Something else here</a></li>
                      <li role="separator" class="divider"></li>
                      <li><a href="#">Separated link</a></li>
                    </ul>
                  </div>
                </div>
              <button type="submit" className="btn btn-default">Išsaugoti</button>
            </form>
          </div>
        </div>
    );
  }

});

window.DistrictCreateEditComponent = DistrictCreateEditComponent;
