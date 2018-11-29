import React, { Component } from 'react';
import { NavigationExperimental } from 'react-native';

import {store, PUSH, POP, initalState } from './NavigatorStore'

const {
  CardStack: NavigationCardStack
} = NavigationExperimental;


import styles from './styles'
import InitialScene from './InitialScene'
import LotsOfGreetings from './examples/LotsOfGreetingsScene'

export default class Navigator extends Component {

  // This sets up the methods (e.g. Pop, Push) for navigation.
  constructor(props, context) {
    super(props, context);

    this._onPushRoute = store.dispatch(PUSH);
    this._onPopRoute  = store.dispatch(POP);;

    this._renderScene = this._renderScene.bind(this);
  }

  // Now we finally get to use the `NavigationCardStack` to render the scenes.
  render() {
    return (
      <NavigationCardStack
        onNavigateBack={this._onPopRoute}
        navigationState={store.getState().navigationState}
        renderScene={this._renderScene}
        style={styles.navigator} />
    )
  }

  // Render a scene for route.
  // The detailed spec of `sceneProps` is defined at `NavigationTypeDefinition`
  // as type `NavigationSceneRendererProps`.
  // Here you could choose to render a different component for each route, but
  // we'll keep it simple.
  _renderScene(sceneProps) {
    console.log(sceneProps);
    const {navigationState} = sceneProps;

    if (navigationState.index === 0) {
      return (
        <InitialScene
          route={sceneProps.scene.route}
          onPushRoute={this._onPushRoute}
          onPopRoute={this._onPopRoute}
          onExit={this.props.onExit}
          />
      );
    }
    else {
      return (
      <LotsOfGreetings
        route={sceneProps.scene.route}
        onPushRoute={this._onPushRoute}
        onPopRoute={this._onPopRoute}
        onExit={this.props.onExit}
        />
      );
    }

  }
}