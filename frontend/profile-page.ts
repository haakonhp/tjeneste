import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('profile-page')
export class ProfilePage extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; justify-content: space-around;">
 <vaadin-button theme="tertiary" tabindex="0" id="home_button" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black ">
   Home 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="view_cars_button">
   View cars 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-vertical-layout theme="spacing" style="background-color:lightgray; width: 100%; height: 90%; align-items: center;" id="vaadinVerticalLayout">
 <h2 style="align-self: center; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; color: #3A7FC4">Profile</h2>
 <vaadin-button id="editProfileButton" style="align-self: center; flex-grow: 0; flex-shrink: 1; width: 30%;" tabindex="0">
   Edit profile 
 </vaadin-button>
 <h2 style="align-self: center; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; color: #3A7FC4">Car</h2>
 <vaadin-button style="align-self: center; width: 30%;" tabindex="0" id="addCarButton">
   Add car 
 </vaadin-button>
 <vaadin-button id="editCarButton" style="align-self: center; width: 30%;" tabindex="0">
   Edit car 
 </vaadin-button>
 <vaadin-button id="deleteCarButton" style="align-self: center; width: 30%;" tabindex="0">
   Delete car 
 </vaadin-button>
 <h2 style="align-self: center; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; color: #3A7FC4">Ads</h2>
 <vaadin-button id="newAdButton" style="align-self: center; width: 30%;" tabindex="0">
   New ad 
 </vaadin-button>
 <vaadin-button style="align-self: center; width: 30%;" tabindex="0" id="editAdsButton">
   Edit ads 
 </vaadin-button>
 <vaadin-button id="deleteAdButton" style="align-self: center; width: 30%;" tabindex="0">
   Delete ad 
 </vaadin-button>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%;  background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative;"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
