var DistrictRepresentativeCreateFormComponent = React.createClass({
  render: function() {
    return (
      <form>
        <div className="form-group">
            <label for="usrName">Vardas:</label>
            <input type="text" className="form-control" id="usrName"/>
        </div>
        <div className="form-group">
            <label for="usrLastName">Pavardė:</label>
            <input type="text" className="form-control" id="usrLastName"/>
        </div>
        <div class="form-group">
          <label for="Selectcounty">Select list:</label>
          <select class="form-control" id="Selectcounty">
            <option>Apylinkė 1</option>
            <option>Apylinkė 2</option>
            <option>Apylinkė 3</option>
            <option>Apylinkė 4</option>
          </select>
        </div>
      </form>
    );
  }

});

window.DistrictRepresentativeCreateFormComponent = DistrictRepresentativeCreateFormComponent;
