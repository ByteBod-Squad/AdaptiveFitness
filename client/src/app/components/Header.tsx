import React from 'react';
import MenuIcon from '@mui/icons-material/Menu';

const Header = () => {
  return (
    <header className="flex items-center justify-between w-full p-8 h-[18%] bg-tertiary text-secondary">
      <div>Logo</div> <MenuIcon fontSize='large'></MenuIcon>
    </header>
  );
};

export default Header;
