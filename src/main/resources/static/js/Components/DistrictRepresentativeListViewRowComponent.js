var DistrictRepresentativeListViewRowComponent = React.createClass({

  render: function() {
    return (
            <tr>
              <td>
                {this.props.name}
              </td>
              <td>
                Petravicius
              </td>
              <td>
                Zirmunu Apylinke
              </td>
            </tr>
    );
  }

});

window.DistrictRepresentativeListViewRowComponent = DistrictRepresentativeListViewRowComponent;
