import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/date-time-picker/src/vaadin-date-time-picker.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('browse-car')
export class BrowseCar extends LitElement {
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
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="profile_button">
   Profile 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout theme="spacing" style="background-color:lightgray; width: 100%; height: 90%; align-items: center;" id="background">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; align-self: flex-start; flex-shrink: 0; flex-grow: 0; flex-direction: column; justify-content: space-evenly;" id="vaadinVerticalLayout">
  <h1 style="align-self: center; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; color: #3A7FC4">Available cars</h1>
  <div style="align-self: center; width: 80%; flex-shrink: 1;">
   <vaadin-date-time-picker id="fromDateTime" style="flex-shrink: 1; width: 35%;" label="From"></vaadin-date-time-picker>
   <vaadin-date-time-picker id="toDateTime" style="align-self: center; width: 35%; margin-left: var(--lumo-space-m);" label="To"></vaadin-date-time-picker>
   <vaadin-button tabindex="0" id="searchButton" style="margin-left: var(--lumo-space-l);">
     Search 
   </vaadin-button>
  </div>
  <vaadin-vertical-layout id="verticalLayout" style="width: 80%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%;  background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative;"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
