var DistrictRespesentativeListViewRowComponent = React.createClass({

  render: function() {
    return (
            <tr>
              <td>
                {this.props.name}
              </td>
              <td>
                {this.props.surname}
              </td>
              <td>
                {this.props.district}
              </td>
            </tr>
    );
  }

});

window.DistrictRespesentativeListViewRowComponent = DistrictRespesentativeListViewRowComponent;
