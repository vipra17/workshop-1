import { LitElement, html, css, customElement } from 'lit-element';

@customElement('product-list-view')
export class ProductListView extends LitElement {
  render() {
    return html`
      <h1>Product List</h1>
      <div>
        Here be products...
      </div>
    `;
  }

  static styles = css`
    :host {
      display: block;
      padding: var(--lumo-space-m);
    }
  `;
}
