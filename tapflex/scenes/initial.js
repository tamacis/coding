import React, { Component } from 'react';
import {
    StyleSheet,
    Text,
    View,
} from 'react-native'


export default class InitScene extends Component {
    render() {
        return (
            <View style={{ flex: 1, flexDirection: 'column', justifyContent: 'space-around', }}>
                <Text style={styles.options}> TapFlex </Text>
                <Text style={styles.options}> Play </Text>
                <Text style={styles.options}> How to play </Text>
            </View>
        )
    }
}

var styles = StyleSheet.create({
    options: {
        fontSize: 30,
        color: '#ffffff'

    }
});