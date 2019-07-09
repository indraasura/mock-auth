import { Navigation } from 'react-native-navigation'
import { registerScreens } from './src/components/screens'

registerScreens()

Navigation.events().registerAppLaunchedListener(() => {
    Navigation.setRoot({
        root: {
            component: {
                name: 'Initializing'
            }
        },
    })
})


