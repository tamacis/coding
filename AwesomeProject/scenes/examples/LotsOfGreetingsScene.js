import React, { Component, PropTypes } from 'react';

import { View, Text, TouchableHighlight } from 'react-native';


import TappableRow from '../TappableRow'

class Greeting extends Component {
  render() {
    return (
      <Text>Hello {this.props.name}!</Text>
    );
  }
}

export default class LotsOfGreetings extends Component {

  static get defaultProps() {
    return {
      title: 'LotsOfGreetings'
    }
  }

  render() {
    return (
      <View style={{ alignItems: 'center' }}>
        <Greeting name='Rexxar' />
        <Greeting name='Jaina' />
        <Greeting name='Valeera' />
        <TappableRow
          text="Tap me to go back"
          onPress={this.props.onPopRoute}
          />
      </View>

    )
  }
}