var CandidatesListViewRowComponent = React.createClass({

  render: function() {
    return (
            <tr>
              <td>
                #
              </td>
              <td>
                {this.props.name}
              </td>
              <td>
                {this.props.surname}
              </td>
              <td>
                {this.props.party}
              </td>
              <td>
                <div>
                	<button type="button" onClick={this.edit} className="btn btn-default" aria-label="Left Align">
                      <i className="glyphicons glyphicons-pencil"></i>
                    </button>
                    <button type="button" onClick={this.delete} className="btn btn-default" aria-label="Left Align">
                      <i className="glyphicons glyphicons-remove"></i>
                    </button>
               </div>
              </td>
            </tr>
    );
  }
});

window.CandidatesListViewRowComponent = CandidatesListViewRowComponent;