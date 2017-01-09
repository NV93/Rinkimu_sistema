var App = React.createClass({
  render: function() {
    return (
      <nav className="navbar navbar-default navbar-fixed-top">
      <div className="container">
        <div className="navbar-header">
          <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span className="sr-only">Toggle navigation</span>
            <span className="icon-bar"></span>
            <span className="icon-bar"></span>
            <span className="icon-bar"></span>
          </button>
          <a className="navbar-brand" href="#">Elections</a>
        </div>
        <div id="navbar" className="navbar-collapse collapse">
          <ul className="nav navbar-nav">
            <li className="active"><a href="#">Home</a></li>
            <li><a href="#/about">About</a></li>
            <li><a href="#/contact">Contact</a></li>
          </ul>
          <ul className="nav navbar-nav navbar-right">
            <li><a href="#">Default</a></li>
            <li><a href="#">Static top</a></li>
          </ul>
        </div>
      </div>
    </nav>
    );
  }
});

var NoMatch = React.createClass({
  render: function() {
    return <div>Route did not match</div>;
  }
});

var Router = ReactRouter.Router;
var Route = ReactRouter.Route;
var IndexRoute = ReactRouter.IndexRoute;
var hashHistory = ReactRouter.hashHistory;

ReactDOM.render((
  <Router history={hashHistory}>
    <Route path="/" component={App}>
      <IndexRoute component={NoMatch} />
      <Route path="/create" component={NoMatch} />
      <Route path="*" component={NoMatch}/>
    </Route>
  </Router>
), document.getElementById('root'));
