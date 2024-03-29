// Displays a message to the user that the app is loading

import React from 'react'
import {
    View,
    Text,
    StyleSheet,
    AsynchStorage
} from 'react-native'

import { goToAuth, goHome } from './navigation'

import { USER_KEY } from './config'

export default class Initializing extends React.Component{
    async componentDidMount() {
        try{
            const user = await AsynchStorage.getItem(USER_KEY)
            console.log('user: ', user)
            // login to home if user exists
            if (user) {
                goHome()
            } else {
                goToAuth()
            }
        } catch (err) {
            console.log('error: ', err)
            goToAuth()
        }
    }

    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.welcome}>Loading</Text>
            </View>
        )
    }
}

const styles = StyleSheet.create({
    welcome: {
        fontSize: 28
    },
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center'
    }
})