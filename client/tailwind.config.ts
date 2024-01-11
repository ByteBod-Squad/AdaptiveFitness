import type { Config } from 'tailwindcss';

const config: Config = {
  content: [
    './src/pages/**/*.{js,ts,jsx,tsx,mdx}',
    './src/components/**/*.{js,ts,jsx,tsx,mdx}',
    './src/app/**/*.{js,ts,jsx,tsx,mdx}',
  ],
  theme: {
    extend: {
      backgroundImage: {
        'gradient-radial': 'radial-gradient(var(--tw-gradient-stops))',
        'gradient-conic':
          'conic-gradient(from 180deg at 50% 50%, var(--tw-gradient-stops))',
      },

      colors: {
        secondary: '#010000', // Text Black [Secondary]
        tertiary: '#E1E1E1', // Slightly less white [Tertiary]
        accent: '#E73725', // Orange ish [Accent]
        primary: '#F8F8F8', // White [Primary]
      },
    },
  },
  plugins: [],
};
export default config;
