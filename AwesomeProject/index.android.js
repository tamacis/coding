import React, { Component } from 'react';
import { AppRegistry } from 'react-native';

// import InitScene from './scenes/InitScene';
// import BleedingEdgeApplication from './scenes/NavigationExperimental/BleedingEdgeApplication'

import NavigatorContainer from './scenes/NavigatorContainer';

class AwesomeProject extends Component {
  render() {
    return (
    <NavigatorContainer/>
    )
  }

}

AppRegistry.registerComponent('AwesomeProject', () => AwesomeProject);