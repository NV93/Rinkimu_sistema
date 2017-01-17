var CandidateCreateEditContainer = React.createClass({
  getInitialState: function() {
    return {
      title : '',
      county: '',
      representatives: '',
    };
  },

  onHandleTitleChange : function(event){
    this.setState({title: event.target.value});
  },

  onHandleCountyChange : function(event){
    this.setState({county: event.target.value});
  },

  onHandleRepresentativesChange : function(event){
    this.setState({representative : event.target.value});
  },

  onHandleSubmit: function(event){
    var self = this;
    event.preventDefault();
    axios.post('/api/districts', this.state)
    .then(function(response){
      console.log(response);
      self.context.router.push('/');
    })
    .catch(function(err){
      console.log('DistrictCreateEditContainer.onHandleSubmit - ',err);
    });

  },

  onHandleCancel:function(){
    this.context.router.push('/');
  },

  render: function() {
    return (
      <div>
      <DistrictCreateEditComponent
          submitButtonName='Išsaugoti'

          name={this.state.name}
          surname={this.state.surname}
          party={this.state.party}

          onHandleTitleChange={this.onHandleTitleChange}
          onHandleCountyChange={this.onHandleCountyChange}
          onHandleRepresentativesChange={this.onHandleRepresentativesChange}

          onHandleSubmit={this.onHandleSubmit}
          onHandleCancel={this.onHandleCancel}

        />
      </div>
    );
  }
});

CandidateCreateEditContainer.contextTypes = {
  router: React.PropTypes.object.isRequired,
};

window.CandidateCreateEditContainer = CandidateCreateEditContainer;
