import React, { Component, PropTypes } from 'react';

import { View, Text , TouchableHighlight} from 'react-native';

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
        <Text>Current Scene: {this.props.title}</Text>
        <Greeting name='Rexxar' />
        <Greeting name='Jaina' />
        <Greeting name='Valeera' />

        <TouchableHighlight onPress={this.props.onForward}>
          <Text>Tap me to load the next scene</Text>
        </TouchableHighlight>
        <TouchableHighlight onPress={this.props.onBack}>
          <Text>Tap me to go back</Text>
        </TouchableHighlight>
      </View>

    )
  }
}

LotsOfGreetings.propTypes = {
  title: PropTypes.string.isRequired,
  onForward: PropTypes.func.isRequired,
  onBack: PropTypes.func.isRequired,
};