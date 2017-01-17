var DistrictRepresentativeListViewRowComponent = React.createClass({

  render: function() {
    return (
            <tr>
              <td>
                {this.props.nr}
              </td>
              <td>
                {this.props.name}
              </td>
              <td>
                Petravicius
              </td>
              <td>
                Zirmunu Apylinke
              </td>
              <td>
                <button type="button" className="btn btn-primary btn-sm">Naujinti</button>
                <button type="button" className="btn btn-danger btn-sm">Trinti</button>
              </td>
            </tr>
    );
  }

});

window.DistrictRepresentativeListViewRowComponent = DistrictRepresentativeListViewRowComponent;
